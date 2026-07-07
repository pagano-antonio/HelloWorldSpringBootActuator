
elenco endpoint:
https://docs.spring.io/spring-boot/reference/actuator/endpoints.html

endpoint + importanti:

 Endpoint di base
Endpoint	Descrizione
/actuator	Elenco di tutti gli endpoint attualmente esposti
/actuator/health	Stato di salute dell'applicazione (customizzabile)
/actuator/info	Info dell'app (da application.properties o programmaticamente)

📊 Endpoint di monitoraggio
Endpoint	Descrizione
/actuator/metrics	Elenco delle metriche disponibili
/actuator/metrics/{name}	Valori dettagliati di una metrica specifica (es. jvm.memory.used)
/actuator/beans	Tutti i bean presenti nel contesto Spring
/actuator/env	Variabili di ambiente, proprietà di sistema e config
/actuator/configprops	Tutte le classi annotate con @ConfigurationProperties
/actuator/loggers	Stato corrente dei logger + possibilità di modificarli runtime

🔒 Endpoint di sicurezza e auditing
Endpoint	Descrizione
/actuator/auditevents	Eventi di auditing registrati da Spring Security (se abilitato)
/actuator/threaddump	Stack trace di tutti i thread in esecuzione
/actuator/heapdump	Heap dump JVM in formato HPROF (richiede spring-boot-starter-actuator)

🔁 Endpoint per gestione runtime
Endpoint	Descrizione
/actuator/shutdown	Arresta l'applicazione in modo controllato (⚠️ disabilitato di default)
/actuator/mappings	Elenco di tutti i mapping URL -> handler Spring MVC
/actuator/scheduledtasks	Visualizza tutti i task pianificati con @Scheduled