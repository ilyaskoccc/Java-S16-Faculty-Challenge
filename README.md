# Üniversite Fakülte Sistemi

Bu proje, bir üniversite içerisinde fakülte, departman, ders ve eğitmenler arasındaki ilişkileri modelleyen bir sistemdir. Proje, nesne yönelimli programlama (OOP) prensiplerini ve ilişki tabanlı modellemeyi kullanarak tasarlanmıştır.

## Proje Özeti

Bir üniversite sistemi içinde:
- Birden fazla fakülte olabilir ve her fakülteye bağlı birden fazla departman bulunabilir.
- Departmanların altında dersler ve eğitmenler tanımlanabilir.
- Sistem, departmanlara özel değişkenler, metodlar ve ders yapıları ile zenginleştirilmiştir.

---

## Sınıflar ve İlişkiler

### 1. **Faculty Sınıfı**
Fakülteleri temsil eder. İçerisinde aşağıdaki bilgiler yer alır:
- `id`: Fakülte kimlik numarası.
- `name`: Fakülte adı.
- `createdDate`: Fakültenin kurulduğu tarih.
- `address`: Fakültenin adresi.
- `dean`: Fakültenin dekanı.
- `departments`: Fakülte altında bulunan departmanlar (bir liste veya koleksiyon).

### 2. **Department Sınıfı**
Departmanları temsil eder. İçerisinde aşağıdaki bilgiler yer alır:
- `id`: Departman kimlik numarası.
- `name`: Departman adı.
- `departmentHead`: Departman başkanı.
- `faculty`: Bağlı olduğu fakülte.

### 3. **Specialized Departments**
Bazı departmanlar, kendilerine özel değişkenler ve metodlar içerebilir. Örneğin:
- **Computer Engineering** departmanında:
  - `programmingLanguagesShouldBeTaught`: Bölümde öğretilecek programlama dillerinin yer aldığı bir liste.

#### Not:
Departman sınıfından türetilen her özel departman, `lessonToLearn` metodunu **@Override** ederek kendi ders içeriklerini tanımlar.

---

### 4. **Course Sınıfı**
Dersleri temsil eder. İçerisinde aşağıdaki bilgiler yer alır:
- `id`: Ders kimlik numarası.
- `name`: Ders adı.
- `gpa`: Dersin not ortalamasına katkısı.

Bir departman birden fazla ders içerebilir. Ancak her ders yalnızca bir departmana bağlıdır.

---

### 5. **Instructor Sınıfı**
Eğitmenleri temsil eder. İçerisinde aşağıdaki bilgiler yer alır:
- `id`: Eğitmen kimlik numarası.
- `firstName`: Eğitmenin adı.
- `lastName`: Eğitmenin soyadı.
- `salary`: Eğitmenin maaşı.
- `hasMsc`: Yüksek lisans derecesine sahip olup olmadığı.
- `hasPhd`: Doktora derecesine sahip olup olmadığı.

#### Instructor Görevleri:
Eğitmenler farklı öğrenci gruplarına (BSc, MSc, PhD) ders verebilirler. Her grup için farklı görevleri bulunur:
- **BSc Programı**: 
  - `presentLesson`
  - `takeExam`
- **MSc Programı**:
  - `presentLesson`
  - `takeExam`
  - `makeALab`
  - `teachToWriteAcademicPaper`
- **PhD Programı**:
  - `presentLesson`
  - `takeExam`
  - `makeALab`
  - `teachToWriteAcademicPaper`
  - `teachAcademicResearch`
  - `introduceStudentToAcademicStaff`

Eğitmenlerin bu programlarla ilişkisi, minimum kod tekrarı ile interfaceler ve miras yapıları kullanılarak sağlanabilir.

---

## Kullanım Talimatları

1. **Repository'yi Kopyalayın**:
   ```bash
   git clone https://github.com/username/java-s16-faculty-challenge.git asd
