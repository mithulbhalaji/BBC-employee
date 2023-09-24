import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaycustomerinvoiceComponent } from './paycustomerinvoice.component';

describe('PaycustomerinvoiceComponent', () => {
  let component: PaycustomerinvoiceComponent;
  let fixture: ComponentFixture<PaycustomerinvoiceComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaycustomerinvoiceComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaycustomerinvoiceComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
