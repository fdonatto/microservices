package com.fdonatto.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fdonatto.hrpayroll.clients.WorkerFeignClient;
import com.fdonatto.hrpayroll.entities.Payment;
import com.fdonatto.hrpayroll.entities.Worker;

@Service
public class PaymentService {
	
	@Autowired
	private WorkerFeignClient workerFeignClient; 
	
	public Payment getPayment(long workerId, int days) {
		Worker worker = workerFeignClient.findById(workerId).getBody();		
		return new Payment(worker.getName(), worker.getDailyIncome(), days);
	}
}
