## Crytocurrency App called Macrypto


# Functionality

Application contains one function: 
* Exchange rates for Bitcoin in different languages

# Screenshots
<img src="scrs/1.png" alt="Menu" width="288" height="512">&nbsp;
<img src="scrs/2.png" alt="Exchange Rate" width="288" height="512">&nbsp;
<img src="scrs/3.png" alt="Exchange Rate" width="288" height="512">

# Service Information
Instruction of the installing API service: https://github.com/blockchain/service-my-wallet-v3#installation

In class `Constants` type your API key:
``` */
   public abstract class Constants {
       public static final String API_KEY = "YOUR-API-KEY";
   }
```



Example use methods from it library .All methods in main thread. For background thread used Rx:


#### Exchange Rates
```
    Observable<Map<String, Currency>> getExchangeRates() {
        return Observable.fromCallable(() -> ExchangeRates.getTicker(Constants.API_KEY))
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.newThread());
    }
```


# Developers

* [Alabi Temitope](https://github.com/tbanj)
