package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    private InvoiceDao invoiceDao;

    @Test
    public void testInvoiceDaoSave(){
        //Given
        Product water = new Product("Water");
        Product orangeJuice = new Product("Orange Juice");
        Item item1 = new Item(new BigDecimal(8), 8, new BigDecimal(8));
        Item item2 = new Item(new BigDecimal(5), 3, new BigDecimal(23));
        water.getItems().add(item1);
        orangeJuice.getItems().add(item2);
        item1.setProduct(water);
        item2.setProduct(orangeJuice);

        Invoice invoice = new Invoice("00101012019");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);

        //When
        invoiceDao.save(invoice);

        //Then
        Assert.assertEquals("00101012019", invoice.getNumber());
        Assert.assertEquals(2, invoice.getItems().size());
        Assert.assertTrue(invoice.getItems().contains(item1));
        Assert.assertTrue(invoice.getItems().contains(item2));
        Assert.assertEquals(water, item1.getProduct());
        Assert.assertEquals(orangeJuice, item2.getProduct());



        //CleanUp
        invoiceDao.deleteById(invoice.getId());
    }


}
