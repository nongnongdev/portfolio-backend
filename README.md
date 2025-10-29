# 🧠 Portfolio Backend

Spring Boot 기반 RESTful API 서버입니다.  
React 프론트엔드와 연동되어 개인 포트폴리오 사이트의 데이터 관리를 담당합니다.

---

## 🚀 Tech Stack
- **Language:** Java 17  
- **Framework:** Spring Boot 3.x  
- **Build Tool:** Gradle  
- **Database:** H2 (개발용) / MySQL (배포용 예정)  
- **ORM:** Spring Data JPA  
- **Validation:** Spring Boot Validation  
- **API 방식:** RESTful  
- **IDE:** IntelliJ IDEA  

---

## 📁 Project Structure
src/
├─ main/
│ ├─ java/com/nongnongdev/portfolio/
│ │ ├─ web/ → Controller 계층 (API 요청 처리)
│ │ ├─ service/ → 비즈니스 로직
│ │ ├─ domain/ → Entity 및 VO
│ │ ├─ repository/ → DB 접근 레이어 (JPA)
│ │ └─ config/ → 환경 설정 (CORS, WebMvc 등)
│ └─ resources/
│ ├─ application.properties
│ └─ static / templates (필요 시)
└─ test/ → 단위 테스트
