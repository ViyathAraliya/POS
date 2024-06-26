package araliya.pointOfSales.dtos;


import java.util.Date;
import java.util.List;

import araliya.pointOfSales.entity.Customer;

import lombok.Data;

@Data
public class TransactionDto {
    
    private  Long transactionID; // newly added
    private Customer customer;
    private List<Transaction_Item_Dto> transaction_Item_dtos;//with transactionID null
    private  Date dateTime;
    private Long totalAmount;
    
    
}
