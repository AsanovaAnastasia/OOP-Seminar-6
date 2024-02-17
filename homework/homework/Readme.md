1. Класс User отвечает за предоставление и сохранение данных. (Single Responsibility Principle)

2. В методе save создается экземпляр класса Persister. Из-за этого класс создается зависимость класса User от Persister. Но оба класса должны зависеть от абстракциий. (Dependency Inversion Principle)