import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class FooBarQuixService {
  constructor(private httpClient: HttpClient) { }

  private REST_API_SERVER = "http://localhost:8080/foo-bar-quix";





  convertNumber(valeurSaisie: any) {

    return this.httpClient.get(this.REST_API_SERVER + "/" + valeurSaisie);
  }

}
