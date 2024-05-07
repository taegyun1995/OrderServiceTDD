package com.productorderservice.tdd.product;

class ProductService {

    private final ProductPort productPort;

    ProductService(ProductPort productPort) {
        this.productPort = productPort;
    }

    public void addProduct(AddProductRequest request) {
        final Product product = new Product(request);

        productPort.save(product);
    }

}
