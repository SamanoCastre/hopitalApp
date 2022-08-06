package com.hopital.app.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hopital.app.consumers.IHopitalConsumer;
import com.hopital.app.dtos.RechercheRequestDTO;
import com.hopital.app.entities.Hopital;
import com.hopital.app.services.IHopitalService;

@Service
public class HopitalServiceImpl implements IHopitalService {
	
	@Autowired
	IHopitalConsumer hopitalConsumer;
	
	

	@Override
	public Hopital rechercherHopital(String lieuIncident, int specialite_id) {
		return  this.hopitalConsumer.rechercherHopital(lieuIncident, specialite_id);
	}	

}
