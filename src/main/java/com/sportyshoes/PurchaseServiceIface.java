package com.sportyshoes;

import java.util.List;
import java.util.Optional;

public interface PurchaseServiceIface {
	
public int createSale(Purchase purchaseDataInput) throws BusinessException;
public int deleteSale(Purchase purchaseDataInput) throws BusinessException;
public List<Purchase> getByDateCategory(Purchase purchaseDataInput) throws BusinessException;
public Optional<Purchase> getPurchaseById(Purchase purchaseDataInput) throws BusinessException;

}