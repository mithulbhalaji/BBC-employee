import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PaymenttrackingComponent } from './paymenttracking.component';

describe('PaymenttrackingComponent', () => {
  let component: PaymenttrackingComponent;
  let fixture: ComponentFixture<PaymenttrackingComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PaymenttrackingComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PaymenttrackingComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
