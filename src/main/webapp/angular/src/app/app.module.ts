import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HttpClientModule} from '@angular/common/http';
import {AppComponent} from './app.component';
import {LoginPageModule} from './login-page/login-page.module';
import {LoginPageComponent} from './login-page/login-page.component';
import {StadiumModule} from './stadium/stadium.module';
import {StadiumComponent} from './stadium/stadium.component';
import {StadiumDetailsComponent} from './stadium/stadium.details.component';
import {NeedAuthGuard} from './auth.guard';
import {APP_BASE_HREF} from '@angular/common';

const appRoutes: Routes = [
  {
    path: 'stadium',
    component: StadiumComponent
  },
  {
    path: 'stadium/:id/details',
    component: StadiumDetailsComponent
  },
  {
    path: 'login',
    component: LoginPageComponent
  },
  {path: '', redirectTo: 'stadium', pathMatch: 'full'},
];

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(appRoutes, { useHash: true }),
    LoginPageModule,
    StadiumModule,
    HttpClientModule
  ],
  providers: [
    NeedAuthGuard,
    {provide: APP_BASE_HREF, useValue : '/stadium/static/saap-stadium' }
  ],
  bootstrap: [AppComponent]
})
export class AppModule {
}
