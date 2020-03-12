import { Component, OnInit } from '@angular/core';
import {LoggingService} from '../../services/logging.service';

@Component({
  selector: 'app-second',
  templateUrl: './second.component.html',
  styleUrls: ['./second.component.css']
})
export class SecondComponent implements OnInit {
  private _loggingService : LoggingService;
  constructor(_loggingService : LoggingService) {
    this._loggingService = _loggingService;
  }

  ngOnInit(): void {
  }

  onClick(){
    this._loggingService.logging();
    // this.logging();
  }
  // logging() : void{
  //   console.log('second component worked');
  // }
}
