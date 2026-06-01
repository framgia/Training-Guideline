# Trainer's Manual — FastAPI

**Module:** FastAPI API Development (Phase 3 — Tutorial-driven)

**Chương trình đào tạo Tech Stack — Python v2.0**

**Release Date:** 06/2026 | **Version:** 2.0

© 2026 By Sun* — Talent Incubator Vietnam — All rights reserved

---

## 1. Mục tiêu môn học

Module FastAPI là Phase 3 trong chương trình đào tạo Tech Stack Python, bao gồm 8 ngày học (64 giờ) theo phương pháp Tutorial-driven: toàn bộ nội dung được giảng dạy thông qua việc xây dựng một sample app hoàn chỉnh từ skeleton đến production-ready, thay vì học lý thuyết rời rạc.

**Điều kiện tiên quyết:** Học viên đã PASS module Python (Fundamentals + Core Ecosystem) — thành thạo Type hints, Pydantic v2, Async/Await, HTTP/REST fundamentals và Auth basics.

### Mục tiêu tổng quát

- Làm chủ FastAPI framework từ project setup đến production deployment.
- Xây dựng RESTful API hoàn chỉnh với layered architecture: routers, services, repositories, schemas, models.
- Áp dụng Dependency Injection — hiểu sâu cơ chế và các pattern phổ biến (DB session, auth user, settings).
- Tích hợp đầy đủ: Auth (JWT + RBAC - Role-based access control), Database (SQLAlchemy 2.x async + Alembic), Caching (Redis), Documentation (Swagger/ReDoc), Docker.
- Hiểu và xử lý được các vấn đề thực tế: N+1 query, cache invalidation, error handling chuẩn hóa, structured logging.

### Năng lực đầu ra sau module

- Tự dựng được FastAPI project với layered architecture không cần template.
- Implement auth flow JWT + RBAC hoàn chỉnh, hiểu refresh token rotation.
- Viết SQLAlchemy 2.x async model với relations, migration Alembic, Repository pattern — không dùng ORM.sync.
- Cache endpoint với Redis, biết khi nào cache và khi nào không nên cache.
- Swagger/ReDoc đầy đủ để FE có thể mock mà không cần hỏi BE.
- `docker compose up` là đủ để chạy toàn bộ stack — không cần setup thủ công.
- Giải thích được các quyết định kỹ thuật: tại sao dùng Depends, tại sao Repository pattern, tại sao yield dependency...

---

## 2. Phân bổ thời gian và Nội dung

Module FastAPI bao gồm 8 ngày học liên tiếp (64 giờ), tương ứng với 8 ngày làm việc. Trong đó, học viên tìm hiểu kiến thức lý thuyết liên quan, tự thực hành, hoàn thiện sample app và giải quyết các vấn đề phát sinh dưới sự hướng dẫn của trainer.

> **Lưu ý:** Mỗi session trong bảng dưới đây tương ứng với 1 ngày học (8 giờ). Trainer có thể linh hoạt điều chỉnh thứ tự topic trong ngày theo tiến độ thực tế. Bài tập thực hành sẽ được thực hiện ngay sau mỗi topic, tích hợp trực tiếp vào sample app.

### Session 1 — Ngày 1: Core Setup & Architecture

| Nội dung | Chi tiết | Thời lượng | Ghi chú |
|----------|----------|:----------:|---------|
| **Core Setup & Architecture** | - Cấu trúc project Layered Architecture<br>- FastAPI app instance, APIRouter, lifespan events<br>- Routing & Request Handling<br>- Dependency Injection<br>- Pydantic v2 Schemas | 8h | Skeleton app chạy được, CRUD endpoints cơ bản cho 1 resource |

### Session 2 — Ngày 2: Database: SQLAlchemy 2.x & Alembic

| Nội dung | Chi tiết | Thời lượng | Ghi chú |
|----------|----------|:----------:|---------|
| **Database: SQLAlchemy 2.x & Alembic** | - SQLAlchemy 2.x async<br>- Model definition<br>- Relationships<br>- Repository Pattern: `BaseRepository[T]`, Async CRUD, Pagination<br>- Alembic Migration<br>- Tích hợp DB vào FastAPI | 8h | Models + migrations, Repository CRUD hoàn chỉnh tích hợp vào sample app |

### Session 3–7 — Ngày 3–7: Business Logic & Core Features

| Nội dung | Chi tiết | Thời lượng | Ghi chú |
|----------|----------|:----------:|---------|
| **Business Logic & Core Features** | - Authentication & Security: Password hashing (passlib/bcrypt), JWT, …<br>- Authorization & RBAC: `get_current_user` dependency, role-based access control, resource ownership<br>- Middleware & Exception Handling<br>- Caching với Redis<br>- API Documentation<br>- Configuration: pydantic-settings, `BaseSettings`, fail-fast env validation, multi-environment<br>- Docker (Optional): Dockerfile multi-stage build, docker-compose (app + DB + Redis)<br>- Logging<br>- Background Tasks & Queue (Optional) | 40h | Tất cả core features của sample app hoàn chỉnh |

### Session 8 — Ngày 8: Review, Refactor & Optimization + Tổng kết

| Nội dung | Chi tiết | Thời lượng | Ghi chú |
|----------|----------|:----------:|---------|
| **Review, Refactor & Optimization** | - Code review toàn bộ sample app: architecture, naming, code quality<br>- Ruff lint pass 100%, mypy không có error<br>- Refactor: loại bỏ code trùng lặp, áp dụng DRY<br>- Performance review<br>- README hoàn chỉnh: setup, env vars, `docker compose up` | 6h | Sample app sẵn sàng cho Phase 4 (Testing) |
| **Tổng kết & Demo** | - Demo live toàn bộ sample app<br>- Checklist evaluation: features, Swagger, Docker, lint/type check<br>- Q&A: trainer hỏi về các quyết định kỹ thuật trong code<br>- Retrospective: những điểm khó, bài học rút ra<br>- Giới thiệu Phase 4 Testing: viết test trên chính sample app này | 2h | Evaluation: Tutorial completion + Demo |

**Tổng cộng: 68 giờ** (8 ngày × 8h + 4h demo/review)

---

## 3. Phụ lục: Đặc tả Sample app

Toàn bộ Phase 3 xoay quanh việc xây dựng một Sample app duy nhất.
Học viên bắt đầu với skeleton app ở ngày 1, và tích hợp thêm tính năng sau mỗi session. Đây là app mà học viên sẽ viết test cho ở Phase 4.

### Tổng quan

| Hạng mục | Mô tả |
|----------|-------|
| **Tên project** | TaskHub — Hệ thống quản lý công việc (Task Management API) |
| **Domain** | Task management system: User, Workspace, Project, Task, Label, Comment, Notification |
| **Tech stack** | FastAPI 0.111+ \| SQLAlchemy 2.x async \| Alembic \| Pydantic v2 \| Redis 7 \| MySQL 8 (hoặc PostgreSQL 16) \| Docker |

### DB Schema (entities chính)

| # | Entity | Fields |
|:-:|--------|--------|
| 1 | **users** | `id`, `email`, `full_name`, `hashed_password`, `role` (ADMIN/MEMBER), `is_active`, `created_at` |
| 2 | **workspaces** | `id`, `name`, `owner_id`, `created_at` |
| 3 | **workspace_members** | `workspace_id`, `user_id`, `role` (OWNER/EDITOR/VIEWER) |
| 4 | **projects** | `id`, `workspace_id`, `name`, `description`, `status` (ACTIVE/ARCHIVED), `created_at` |
| 5 | **tasks** | `id`, `project_id`, `assignee_id`, `title`, `description`, `status` (TODO/IN_PROGRESS/IN_REVIEW/DONE), `priority` (LOW/MEDIUM/HIGH/URGENT), `due_date`, `created_by`, `created_at` |
| 6 | **labels** | `id`, `project_id`, `name`, `color` |
| 7 | **task_labels** | `task_id`, `label_id` |
| 8 | **comments** | `id`, `task_id`, `author_id`, `content`, `created_at` |

### Features (bắt buộc)

| # | Feature | Mô tả |
|:-:|---------|-------|
| 1 | **Auth** | Register, Login (JWT access + refresh token), Logout (revoke refresh token) |
| 2 | **User** | Get profile, Update profile (PATCH), Change password |
| 3 | **Workspace** | CRUD (owner only), Invite member, Remove member, Phân quyền theo role |
| 4 | **Project** | CRUD trong workspace, Archive project |
| 5 | **Task** | CRUD trong project, Assign task cho member, Chuyển status, Đặt priority & due_date |
| 6 | **Label** | CRUD (per project), Gán/bỏ label cho task |
| 7 | **Comment** | Thêm/xóa comment trên task |
| 8 | **Filtering & Pagination** | Lọc task theo status, priority, assignee; page + limit |
| 9 | **Caching** | Cache `GET /projects/{id}/tasks` với Redis, invalidate khi có thay đổi |
| 10 | **Background Task** | Gửi email notification khi được assign task |
| 11 | **RBAC** | Phân quyền ADMIN / OWNER / EDITOR / VIEWER đúng theo từng resource |
| 12 | **Swagger/ReDoc** | Đầy đủ, có Bearer auth scheme, document error responses |
| 13 | **Docker** | `docker compose up` chạy được toàn bộ stack (app + DB + Redis) |
| 14 | **Code Quality** | Ruff lint pass 100%, mypy không có error |

### API Endpoints (tham khảo)

**Auth:**
- `POST /api/v1/auth/register`
- `POST /api/v1/auth/login`
- `POST /api/v1/auth/refresh`
- `POST /api/v1/auth/logout`

**User:**
- `GET /api/v1/users/me`
- `PATCH /api/v1/users/me`

**Workspace:**
- `POST /api/v1/workspaces`
- `GET /api/v1/workspaces/{id}`
- `POST /api/v1/workspaces/{id}/members`
- `DELETE /api/v1/workspaces/{id}/members/{user_id}`

**Project & Task:**
- `POST /api/v1/workspaces/{id}/projects`
- `GET /api/v1/projects/{id}/tasks` *(filter + pagination + cache)*
- `POST /api/v1/projects/{id}/tasks`
- `PATCH /api/v1/tasks/{id}`
- `DELETE /api/v1/tasks/{id}`

**Label & Comment:**
- `POST /api/v1/tasks/{id}/labels/{label_id}`
- `POST /api/v1/tasks/{id}/comments`

### Evaluation

- Hoàn thành >= 85% features bắt buộc (tối thiểu features 1–8 + 11–12)
- API chạy ổn định qua Swagger UI / ReDoc
- Giải thích được các quyết định thiết kế: DB schema, phân quyền, cache strategy
