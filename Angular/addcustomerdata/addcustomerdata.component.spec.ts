import { ComponentFixture, TestBed } from '@angular/core/testing';

import { AddcustomerdataComponent } from './addcustomerdata.component';

describe('AddcustomerdataComponent', () => {
  let component: AddcustomerdataComponent;
  let fixture: ComponentFixture<AddcustomerdataComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ AddcustomerdataComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(AddcustomerdataComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
