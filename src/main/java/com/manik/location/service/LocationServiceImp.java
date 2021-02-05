package com.manik.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manik.location.enities.Location;
import com.manik.location.repo.LocationRepository;

@Service
public class LocationServiceImp implements LocationService {
	@Autowired
	private LocationRepository repository;
	

	@Override
	public Location saveLocation(Location location) {
		
		return getRepository().save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		
		return getRepository().save(location);
		
	}

	@Override
	public void deleteLocation(Location location) {
		getRepository().delete(location);

	}

	@Override
	public Location getLocationById(int id) {
		
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocations() {
		
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}


}
