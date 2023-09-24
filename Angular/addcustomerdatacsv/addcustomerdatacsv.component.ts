import { Component, OnInit } from '@angular/core';
import { HttpService } from '../http.service';

@Component({
  selector: 'app-addcustomerdatacsv',
  templateUrl: './addcustomerdatacsv.component.html',
  styleUrls: ['./addcustomerdatacsv.component.css']
})
export class AddcustomerdatacsvComponent implements OnInit {

  selectedFile: File | null = null;
  responseMessage:string ="";

  constructor(private http: HttpService) { }

  ngOnInit(): void {
  }
  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
  }
  onSubmit() {
    if (this.selectedFile) {
      this.http.addCustomerInvoiceCsv(this.selectedFile).subscribe(
        (response)=>{
          console.log('File uploaded successfully:', response);
          this.responseMessage="File uploaded successfully";
        },
        (error) => {      
          console.error('Error uploading file:', error);
        }
      )
    } else {
      console.warn('No file selected.');
    }
  }
}
