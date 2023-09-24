import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-addcustomer',
  templateUrl: './addcustomer.component.html',
  styleUrls: ['./addcustomer.component.css']
})
export class AddcustomerComponent implements OnInit {

  responseMessage:any='';

  constructor(private http:HttpService,private route:Router) { }

  ngOnInit(): void {
  }
  onSubmit(
    customerName: string,
    customerEmail: string,
    customerTelephoneNumber: string
  ){
    let obj={
      "customerName": customerName,
        "customerEmail": customerEmail,
        "customerTelephoneNumber":customerTelephoneNumber
    }
    this.http.addCustomerInvoice(obj).subscribe(
      (response)=>{
        sessionStorage.setItem("customer1",obj.customerName);
        this.responseMessage="Customer added successfully";
      }
    )
  }

  
  
}
