import {Component, OnInit} from '@angular/core';
import {DealService} from 'app/entities/deal/deal.service';
import {Deal} from 'app/entities/deal.model';

@Component({
  selector: 'jhi-deal',
  templateUrl: './add-deal.component.html',
  styles: []
})
export class AddDealComponent implements OnInit {
  deal: Deal = new Deal();
  constructor(private dealService: DealService) {
  }

  ngOnInit() {
  }

  submit() {
    console.log('saving deal...');
    this.dealService.create(this.deal).subscribe(result => {
      this.deal = result;
    }, err => {
      console.log('handle error');
    });
  }

}
