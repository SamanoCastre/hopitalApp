package com.hopital.app.services;

import com.hopital.app.entities.Hopital;

public interface IHopitalService {
	
	public Hopital rechercherHopital(String lieuIncident, int specialite_id);
}
