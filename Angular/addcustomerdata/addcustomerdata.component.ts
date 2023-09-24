import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Router } from '@angular/router';
import { Title } from '@angular/platform-browser';



@Component({
  selector: 'app-addcustomerdata',
  templateUrl: './addcustomerdata.component.html',
  styleUrls: ['./addcustomerdata.component.css']
})
export class AddcustomerdataComponent implements OnInit {

  responseMessage:string="";

  constructor(private service:HttpService,private router:Router) { }

  ngOnInit(): void {
  }

  onSubmit(
    customerId: string,
    startDate: string,
    endDate: string,
    unitConsumed:string,
    customerName: string,
    customerEmail: string,
    customerTelephoneNumber: string
  ) {
    let obj={
      "customerId":customerId,
      "startDate":startDate,
      "endDate":endDate,
      "unitConsumed":unitConsumed,
      "customerName":customerName,
      "customerEmail":customerEmail,
      "customerTelephoneNumber":customerTelephoneNumber
    }

    this.service.addCustomerInvoice(obj)
    .subscribe((response:any)=>{
      console.log(response);
      this.responseMessage="added successfully";
    },(error)=>{
      console.log(error);
    }
    )

  }

}
