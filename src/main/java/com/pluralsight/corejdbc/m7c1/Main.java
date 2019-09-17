package com.pluralsight.corejdbc.m7c1;

public class Main {

	public static void main(String[] args) throws Exception {

		try {
			ProductsComponent comp = new ProductsComponent();
			comp.printProductList();
		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}
	}
}
