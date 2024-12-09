Java-S16-Faculty-Challenge
Üniversite Fakülte Sistemi
Bu proje, bir üniversite içerisindeki fakülte, departman, ders ve eğitmenler arasındaki ilişkileri modelleyen bir sistemdir. Nesne yönelimli programlama (OOP) prensiplerini temel alır ve ilişki tabanlı modellemeyi içerir.

Proje Özeti
Bu sistem:

Birden fazla fakülte ve bu fakültelere bağlı departmanları içerir.
Departmanlara özgü değişkenler ve ders yapıları ile zenginleştirilmiştir.
Eğitmenlerin farklı öğrenci gruplarına farklı görevlerle ders verebildiği bir yapı sunar.
Sınıflar ve İlişkiler
1. Faculty Sınıfı
Fakülteleri temsil eder. İçerisinde:

id: Fakülte kimlik numarası.
name: Fakülte adı.
createdDate: Kuruluş tarihi.
address: Fakültenin adresi.
dean: Fakülte dekanı.
departments: Fakülteye bağlı departmanlar bulunur (bir koleksiyon ya da liste).
2. Department Sınıfı
Departmanları temsil eder. İçerisinde:

id: Departman kimlik numarası.
name: Departman adı.
departmentHead: Departman başkanı.
faculty: Bağlı olduğu fakülte.
Specialized Departments
Bazı departmanlar kendilerine özel değişkenler ve metodlar içerir. Örneğin:

Computer Engineering:
programmingLanguagesShouldBeTaught: Öğretilecek programlama dillerinin yer aldığı bir liste.
Her departman, lessonToLearn metodunu @Override ederek departmana özgü ders içeriklerini tanımlar.

3. Course Sınıfı
Dersleri temsil eder. İçerisinde:

id: Ders kimlik numarası.
name: Ders adı.
gpa: Dersin ortalamaya katkısı.
Bir departman birden fazla ders içerebilir. Ancak her ders yalnızca bir departmana aittir.

4. Instructor Sınıfı
Eğitmenleri temsil eder. İçerisinde:

id: Eğitmen kimlik numarası.
firstName: Adı.
lastName: Soyadı.
salary: Maaşı.
hasMsc: Yüksek lisans derecesine sahip olup olmadığı.
hasPhd: Doktora derecesine sahip olup olmadığı.
Eğitmen Görevleri
Eğitmenler farklı öğrenci gruplarına ders verebilirler:

BSc (Lisans) Programı:
presentLesson
takeExam
MSc (Yüksek Lisans) Programı:
presentLesson
takeExam
makeALab
teachToWriteAcademicPaper
PhD (Doktora) Programı:
presentLesson
takeExam
makeALab
teachToWriteAcademicPaper
teachAcademicResearch
introduceStudentToAcademicStaff
Bu görevler, interfaceler ve miras kullanılarak minimum kod tekrarı ile modellenmiştir.
