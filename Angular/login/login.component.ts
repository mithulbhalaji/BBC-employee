import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';
import { Route, Router } from '@angular/router';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  employeeId!:number;
  otpSend:number=0;
  isCheckButtonHidden:boolean = true;
  sentMessage:string="";
  otpMessage:string= "";
  constructor(private service:HttpService,private router:Router) { }

  ngOnInit(): void {
  }

  onGenerateOTP(employeeId:string){
    if(!employeeId){
      alert("Enter your customer ID");
    }else{

      this.service.getEmployee(Number.parseInt(employeeId)).subscribe(
        (response)=>{
          this.sentMessage = "OTP sent to your "+response;
        }
      );
      this.service.getOTP().subscribe(
        (response)=>{
          this.otpSend = response;
          this.otpMessage = "OTP is "+this.otpSend;
        },(error) => {
          console.log( error);
        }
      );
      this.isCheckButtonHidden=false;
    }
    
  }

  checkOTP(otp:string){
    if(otp==this.otpSend.toString()){
      this.router.navigate(['/home']);
    }else{
      alert("Enter valid OTP!!");
    }
    
  }

}
