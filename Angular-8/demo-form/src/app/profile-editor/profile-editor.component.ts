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
    lastName : [''],
    address : this.fb.group({
      street : [''],
      dist : [''],
      city : ['']
    }),
    aliases: this.fb.array([
      this.fb.control('')
    ])
  });
  onSubmit(){
    console.log(this.profileForm.value);
  }
  updateProfile(){
    this.profileForm.patchValue({
      firstName : 'Thi',
      lastName : 'La Quy',
      address : {
        street : 'dong hung thai binh'
      }
    })
  }
  get aliases(){
    return this.profileForm.get('aliases') as FormArray;
  }
  addAlias(){
    this.aliases.push(this.fb.control(''));
  }
  constructor(private fb : FormBuilder) { }

  ngOnInit(): void {
  }

}
