package com.aashutosh.restaurantcatalogservice.models;

import java.util.List;

public class Catalogs {
    private List<CatalogItem> catalogItems;

    public Catalogs() {
    }

    public Catalogs(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }

    public List<CatalogItem> getCatalogItems() {
        return catalogItems;
    }

    public void setCatalogItems(List<CatalogItem> catalogItems) {
        this.catalogItems = catalogItems;
    }
}
