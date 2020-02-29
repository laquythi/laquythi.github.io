import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { Page1Component } from './page1/page1.component';
import { Page1AccountComponent } from './page1-account/page1-account.component';
import { Page1WithdrawComponent } from './page1-withdraw/page1-withdraw.component';
import { Page1EventComponent } from './page1-event/page1-event.component';
import { Page1LoanComponent } from './page1-loan/page1-loan.component';
import { Page1InvestmentComponent } from './page1-investment/page1-investment.component';
import { Page1ServiceComponent } from './page1-service/page1-service.component';
import { Page1UpdateComponent } from './page1-update/page1-update.component';
import { Page1Other1Component } from './page1-other1/page1-other1.component';
import { Page1FooterComponent } from './page1-footer/page1-footer.component';

@NgModule({
  declarations: [
    AppComponent,
    Page1Component,
    Page1AccountComponent,
    Page1WithdrawComponent,
    Page1EventComponent,
    Page1LoanComponent,
    Page1InvestmentComponent,
    Page1ServiceComponent,
    Page1UpdateComponent,
    Page1Other1Component,
    Page1FooterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
