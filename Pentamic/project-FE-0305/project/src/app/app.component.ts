
import { Component } from '@angular/core';
import { HttpClient, HttpParams } from "@angular/common/http";
import {Data} from '@angular/router';
import DataSource from 'devextreme/data/data_source';
// import DataSource from 'devextreme/data/data_source';

// import { BrowserModule } from '@angular/platform-browser';
import { DxDataGridModule , DxButtonModule } from 'devextreme-angular';
// import { platformBrowserDynamic } from '@angular/platform-browser-dynamic';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})

export class AppComponent {
  title = 'project';
  // dataStore !: any;
  // data !: DataSource[];
  // dataStore : DataSource[];

  constructor(private http:HttpClient){
   //  this.dataStore = this.getData();
  } 
  data !: Data[];
  // create method getData()
  getData() : Promise<Data[]>{
    const params = new HttpParams();
    return this.http
      .get('https://jsonplaceholder.typicode.com/posts', {
        params: params
      })
      .toPromise()
      .then((res) => {
        this.data = res as Data[];
       console.log(this.data);
        return this.data;
      });
  }


  // getData() : Promise<DataSource[]>{
  //   const params = new HttpParams();
  //   return this.http
  //     .get('https://jsonplaceholder.typicode.com/posts', {
  //       params: params
  //     })
  //     .toPromise()
  //     .then((res) => {
  //       this.data = res as DataSource[];
  //      console.log(this.data);
  //       return this.data;
  //     });
  // }

  // dataStore !: Data[];
  // dataStore = this.getData;

}