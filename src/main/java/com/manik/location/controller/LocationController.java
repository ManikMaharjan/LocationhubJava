package com.manik.location.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.manik.location.enities.Location;
import com.manik.location.service.LocationService;
import com.manik.location.util.EmailUtil;

@Controller
public class LocationController {
	@Autowired
	LocationService service;
	@Autowired
	EmailUtil emailutil;
	
	@RequestMapping("/showCreate")
	public String showCreate() {

		return "createLocation";

	}

	@RequestMapping("/saveLoc")
	public String saveLocation(@ModelAttribute("location") Location location, ModelMap modelMap) {
		Location locationSaved = service.saveLocation(location);
		String msg = "Locaction saved with id " + locationSaved.getId();
		modelMap.addAttribute("msg", msg);
		emailutil.sendEmail("manikmaharjan1@gmail.com","location saved","savedbody done");
		return "createLocation";

	}

	@RequestMapping(value = "/displayLocations")
	public String displayLocations(ModelMap modelMap) {
		List<Location> locations = service.getAllLocations();
		modelMap.addAttribute("locations", locations);

		return "displayLocations";
	}

	@RequestMapping("deleteLocation")
	public String deleteLocation(@RequestParam int id,ModelMap modelMap) {
		//Location location = service.getLocationById(id);
		Location location = new Location();
		location.setId(id);
		service.deleteLocation(location);
		List<Location> locations=service.getAllLocations();
		modelMap.addAttribute("locations",locations);
		
		return "displayLocations";
	}

	@RequestMapping("/updateLocation")
	public String showUpdate(@RequestParam("id") int id,ModelMap modelMap  ) {
		Location location = service.getLocationById(id);
		modelMap.addAttribute("location", location);
		return "editLocation";
	}
	
	@RequestMapping("/uploadLoc")
	public String updateLocation(@ModelAttribute("location") Location location,ModelMap modelMap ) {
	 service.updateLocation(location);

	 List<Location> locations = service.getAllLocations();
	 modelMap.addAttribute("locations", locations);
		return "displayLocations";
		
	}
	
}
