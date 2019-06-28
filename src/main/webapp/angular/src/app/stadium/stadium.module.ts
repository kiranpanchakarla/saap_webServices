import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { StadiumComponent } from './stadium.component';
import { StadiumDetailsComponent } from './stadium.details.component';

@NgModule({
  imports: [
    CommonModule
  ],
  declarations: [
    StadiumComponent,
    StadiumDetailsComponent
  ],
  exports: [
    StadiumComponent,
    StadiumDetailsComponent
  ]
})
export class StadiumModule { }
