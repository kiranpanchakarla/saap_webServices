import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { StadiumDetailsComponent } from './stadium.details.component';

describe('StadiumDetailsComponent', () => {
  let component: StadiumDetailsComponent;
  let fixture: ComponentFixture<StadiumDetailsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ StadiumDetailsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(StadiumDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
