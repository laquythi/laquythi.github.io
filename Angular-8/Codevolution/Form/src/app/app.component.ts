import { Component } from '@angular/core';
import {User} from './user';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Form';
  topics = ['python','java','ruby'];
  userModel = new User('thi','thilaquy@gmail.com',3456,'','morning',false);
}
