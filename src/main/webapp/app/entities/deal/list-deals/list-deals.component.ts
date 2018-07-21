import {Component, OnInit} from '@angular/core';
import {DealService} from 'app/entities/deal/deal.service';
import {Deal} from 'app/entities/deal.model';

@Component({
  selector: 'jhi-list-deals',
  templateUrl: './list-deals.component.html',
  styles: []
})
export class ListDealsComponent implements OnInit {
  deals: Deal[];
  constructor(private dealService: DealService) { }

  ngOnInit() {
    this.dealService.list().subscribe(result => {
      this.deals = result;
    },
  err => {
    console.log('handle error...');
  });
  }

}
