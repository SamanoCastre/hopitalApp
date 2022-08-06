package com.hopital.app.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hopital.app.consumers.IReservationConsumer;
import com.hopital.app.dtos.ReservationRequestDTO;
import com.hopital.app.entities.Reservation;
import com.hopital.app.services.IReservationService;

@Service
public class ReservationServiceImpl implements IReservationService{
	@Autowired
	IReservationConsumer reservationConsumer;
	
	@Override
	public Reservation reserverLitHopital(ReservationRequestDTO reservationDTO) {
		return this.reservationConsumer.reserverLitHopital(reservationDTO);	
	}
}
