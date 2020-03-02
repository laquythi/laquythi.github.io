import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AccountComponent } from './account/account.component';
import { WithdrawComponent } from './withdraw/withdraw.component';
import { EventComponent } from './event/event.component';
import { LoanComponent } from './loan/loan.component';
import { InvestmentComponent } from './investment/investment.component';
import { ServiceComponent } from './service/service.component';
import { UpdateComponent } from './update/update.component';
import { Page1Component } from './page1/page1.component';
import { OtherComponent } from './other/other.component';
import { FooterButtonComponent } from './footer-button/footer-button.component';
import { FooterLangViComponent } from './footer-lang-vi/footer-lang-vi.component';
import { FooterLangEngComponent } from './footer-lang-eng/footer-lang-eng.component';
import { Page2Component } from './page2/page2.component';
import { Header2Component } from './header2/header2.component';
import { Body2Component } from './body2/body2.component';
import { Footer2Component } from './footer2/footer2.component';
import { UserId2Component } from './user-id2/user-id2.component';
import { UserPassport2Component } from './user-passport2/user-passport2.component';
import { UserQrCode2Component } from './user-qr-code2/user-qr-code2.component';

@NgModule({
  declarations: [
    AppComponent,
    AccountComponent,
    WithdrawComponent,
    EventComponent,
    LoanComponent,
    InvestmentComponent,
    ServiceComponent,
    UpdateComponent,
    Page1Component,
    OtherComponent,
    FooterButtonComponent,
    FooterLangViComponent,
    FooterLangEngComponent,
    Page2Component,
    Header2Component,
    Body2Component,
    Footer2Component,
    UserId2Component,
    UserPassport2Component,
    UserQrCode2Component
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
