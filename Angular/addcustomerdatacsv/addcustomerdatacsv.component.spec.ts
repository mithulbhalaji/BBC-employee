import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcustomerdatacsvComponent } from './addcustomerdatacsv.component';

describe('AddcustomerdatacsvComponent', () => {
  let component: AddcustomerdatacsvComponent;
  let fixture: ComponentFixture<AddcustomerdatacsvComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcustomerdatacsvComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddcustomerdatacsvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
