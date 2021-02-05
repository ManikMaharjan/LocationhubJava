package com.manik.location.service;

import java.util.List;

import com.manik.location.enities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocation(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocations(); /// sab data lera aaucha
}
	

