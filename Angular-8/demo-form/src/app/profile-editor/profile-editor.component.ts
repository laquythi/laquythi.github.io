import { Component, OnInit } from '@angular/core';
// import {FormGroup,FormControl} from '@angular/forms';
import {FormBuilder} from '@angular/forms';
import {Validators} from '@angular/forms';
import {FormArray} from '@angular/forms';

@Component({
  selector: 'app-profile-editor',
  templateUrl: './profile-editor.component.html',
  styleUrls: ['./profile-editor.component.css']
})
export class ProfileEditorComponent implements OnInit {
  profileForm = this.fb.group({
    firstName : ['',Validators.required],
    lastName : ['',Validators.required],
    address : this.fb.group({
      street : [''],
      dist : [''],
      city : ['']
    }),
    aliases : this.fb.array([
      this.fb.control('')
    ])
  });
  updateProfile(){
    this.profileForm.patchValue({
      firstName : 'memories phamm',
      address : {
        street : 'dinh thon,my dinh'
      }
    });
  }
  onSubmit(){
    console.log(this.profileForm.value);
  }
  get aliases (){
    return this.profileForm.get('aliases') as FormArray;
  }
  addAlias(){
    this.aliases.push(this.fb.control(''));
  }
  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
  }

}
