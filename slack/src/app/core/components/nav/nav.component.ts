import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Canal } from 'src/app/canaux/models/canal';
import { CanauxService } from 'src/app/canaux/services/canaux.service';


@Component({
  selector: 'app-nav',
  templateUrl: './nav.component.html',
  styleUrls: ['./nav.component.scss']
})
export class NavComponent {

  public collectionCanal$!: Observable<Canal[]>;

  constructor(private canauxService: CanauxService, private router: Router) {
    this.collectionCanal$ = this.canauxService.collectionCanal$;
  }

  public goToCanal(id: number) {
    this.router.navigate(['messages',id]);
    // this.router.navigate(['messages'],{queryParams:{canal:id}});
  }
}
