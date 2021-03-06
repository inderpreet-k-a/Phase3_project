package com.sportyshoes;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PurchaseServiceImpl implements PurchaseServiceIface{

	@Autowired
	PurchaseRepository purchaseRepository;
	
	@Override
	public int createSale(Purchase purchaseDataInput) throws BusinessException {
		// TODO Auto-generated method stub
		return purchaseRepository.createSale(purchaseDataInput);
	}

	@Override
	public int deleteSale(Purchase purchaseDataInput) throws BusinessException {
		// TODO Auto-generated method stub
		return purchaseRepository.deleteSale(purchaseDataInput.getId());
	}

	@Override
	public List<Purchase> getByDateCategory(Purchase purchaseDataInput) throws BusinessException {
		// TODO Auto-generated method stub
		Purchase purchase=new Purchase();
		purchase.setCategory(purchaseDataInput.getCategory());
		purchase.setCreatedAt(purchaseDataInput.getCreatedAt());
		return purchaseRepository.findByDateCategory(purchase);
	}

	@Override
	public Optional<Purchase> getPurchaseById(Purchase purchaseDataInput) throws BusinessException {
		// TODO Auto-generated method stub
		return purchaseRepository.findById(purchaseDataInput.getId());
	}

}
