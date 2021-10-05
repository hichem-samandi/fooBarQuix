import { Component, EventEmitter, OnInit, Output } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { FooBarQuixService } from '../foo-bar-quix.service';

@Component({
  selector: 'app-foo-bar-quix-form',
  templateUrl: './foo-bar-quix-form.component.html'
})
export class FooBarQuixFormComponent implements OnInit {


  valeurSaisie: any;
  result: any;

  checkoutForm = this.formBuilder.group({
    numberConvert: '',

  });

  constructor(private formBuilder: FormBuilder, private fooBarQuixService: FooBarQuixService) {

  }

  ngOnInit(): void {
  }

  submitNumber(): void {
    console.log("submitNumber");
    console.log(this.valeurSaisie);
    this.fooBarQuixService.convertNumber(this.valeurSaisie).subscribe((data: any) => {
      console.log(data);
      this.result = data;
    })
  }

}
