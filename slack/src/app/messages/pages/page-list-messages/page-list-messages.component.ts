import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Message } from '../../models/message';
import { MessagesService } from '../../services/messages.service';

@Component({
  selector: 'app-page-list-messages',
  templateUrl: './page-list-messages.component.html',
  styleUrls: ['./page-list-messages.component.scss']
})
export class PageListMessagesComponent {
  public canal!:number;
  public collectionMessage$!: Observable<Message[]>;


  constructor(private messagesService: MessagesService, private router: Router, private activatedRoute: ActivatedRoute){
    this.activatedRoute.params.subscribe((params) => {
      this.canal = params['canal'];
      this.collectionMessage$ = this.messagesService.getByCanal(this.canal);
    });
  }
}
