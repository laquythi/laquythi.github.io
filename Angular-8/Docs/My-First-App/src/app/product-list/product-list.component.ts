import { Component } from '@angular/core';
import {products} from '.././products';

@Component({
  selector: 'app-product-list',
  templateUrl:'./product-list.component.html',
  styleUrls: ['./product-list.component.css']
})

export class ProductListComponent {
  product = products;
  share(){
    window.alert('the product has been shared');
  }
}
