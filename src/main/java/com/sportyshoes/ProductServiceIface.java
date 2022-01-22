package com.sportyshoes;

import java.util.List;
import java.util.Optional;


public interface ProductServiceIface {
	public int updateProduct(Product prodDataInput) throws BusinessException;

	public int createProduct(Product prodDataInput) throws BusinessException;

	public int deleteProduct(Product prodDataInput) throws BusinessException;

	public List<Product> getProdByCategory(Product prodDataInput) throws BusinessException;

	public Optional<Product> getPodById(Product prodDataInput) throws BusinessException;
}
