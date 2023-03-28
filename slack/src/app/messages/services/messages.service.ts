import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Message } from '../models/message';

@Injectable({
  providedIn: 'root'
})
export class MessagesService {
  private urlApi: string;
  public collectionMessage$: Observable<Message[]>;

  constructor(private httpClient: HttpClient) {
      this.urlApi = 'http://localhost:3000/messages';
      this.collectionMessage$ = this.httpClient.get<Message[]>(this.urlApi);
   }
  public getByCanal(canal: number): Observable<Message[]> {
    return this.httpClient.get<Message[]>(`${this.urlApi}/?canal=${canal}`);
  }
}
