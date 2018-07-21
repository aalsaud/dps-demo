import {Observable} from 'rxjs';
import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class DealService {
  readonly url = '/api/v1/deal';
  constructor(private http: HttpClient) {  }

  get(id): Observable<any> {
    return this.http.get(this.url, id);
  }
  create(deal): Observable<any> {
    return this.http.post(this.url, deal);
  }
  update(deal): Observable<any> {
    return this.http.put(this.url, deal);
  }
  delete(id): Observable<any> {
    return this.http.delete(this.url, id);
  }
  list(): Observable<any> {
    return this.http.get(`${this.url}/all`);
  }
}
