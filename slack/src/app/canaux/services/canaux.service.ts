import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Canal } from '../models/canal';

@Injectable({
  providedIn: 'root'
})
export class CanauxService {
  private urlApi: string;
  public collectionCanal$: Observable<Canal[]>;

  constructor(private httpClient: HttpClient) {
      this.urlApi = 'http://localhost:3000/canaux';
      this.collectionCanal$ = this.httpClient.get<Canal[]>(this.urlApi);
   }

}
