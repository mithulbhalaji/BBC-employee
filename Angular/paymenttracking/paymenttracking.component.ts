import { Component, OnInit } from '@angular/core';
import { Payment } from '../payment';
import { HttpService } from '../http.service';
@Component({
  selector: 'app-paymenttracking',
  templateUrl: './paymenttracking.component.html',
  styleUrls: ['./paymenttracking.component.css']
})
export class PaymenttrackingComponent implements OnInit {


  payments: Payment[] = [];
  customerId:number=0;
  constructor(private http:HttpService) { }

  ngOnInit(): void {
  }

  onSubmit(customerId:string){
      this.http.getPayments(parseInt(customerId)).subscribe(
        (response) =>{
          this.payments = response as Payment[];
        }
      );
  }

}
