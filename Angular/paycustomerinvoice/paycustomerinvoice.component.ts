import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';


@Component({
  selector: 'app-paycustomerinvoice',
  templateUrl: './paycustomerinvoice.component.html',
  styleUrls: ['./paycustomerinvoice.component.css']
})
export class PaycustomerinvoiceComponent implements OnInit {


  responseMessage:string= "";
  constructor(private http:HttpService) { }

  ngOnInit(): void {
  }

  onSubmit(invoiceId:string){
    this.http.updatePaymentStatus(parseInt(invoiceId)).subscribe(
      (response) =>{
        console.log("done",response);
        this.responseMessage="Payment done successfully";
      },(error)=>{
        console.error("error",error);
      }
    );
  }

}
