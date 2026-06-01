# Trainer's Manual — Python

**Module:** Python Fundamentals & Python Core

**Chương trình đào tạo Tech Stack — Python v2.0**

**Release Date:** 06/2026 | **Version:** 2.0

© 2026 By Sun* — Talent Incubator Vietnam — All rights reserved

---

## 1. Mục tiêu môn học

Module này bao gồm hai phần học liên tiếp trong 3 ngày của chương trình đào tạo Tech Stack Python:

### Python Fundamentals (Ngày 1 & 2)

Phần này xây dựng nền tảng ngôn ngữ Python vững chắc, giúp học viên viết code Python đúng cú pháp, rõ ràng và đúng convention từ ngày đầu. Nội dung bao gồm:

- Cú pháp Python 3.12+, kiểu dữ liệu cơ bản và các thao tác phổ biến
- Collections: List, Tuple, Set, Dictionary — đặc điểm và cách dùng phù hợp từng loại
- Flow control: điều kiện, vòng lặp, comprehensions
- Functions: tham số, `*args`/`**kwargs`, lambda, closure, higher-order functions
- OOP: class, kế thừa, encapsulation, polymorphism, dunder methods, dataclasses
- Decorators: viết và sử dụng decorator trong thực tế
- Modules & Packages: cấu trúc project, standard library
- File I/O, Exception handling, Context manager
- Virtual environment và Python tooling (uv, Ruff, mypy)

### Python Core (Ngày 2 & 3)

Phần này trang bị các kiến thức nâng cao là nền tảng bắt buộc để học FastAPI hiệu quả. Đây là những kiến thức mà Python khác biệt đáng kể so với các ngôn ngữ khác (Node.js, Ruby, Java...) và cần được nắm vững trước khi bước vào Phase tiếp theo. Nội dung bao gồm:

- Type Hints & Typing: annotation đầy đủ, Generic, Protocol, mypy — cơ sở của FastAPI/Pydantic
- Asyncio & Async/Await: event loop, `asyncio.gather`, async context manager — cơ sở của FastAPI async handlers
- Pydantic v2: BaseModel, field validators, model serialization — trọng tâm quan trọng nhất, ở mức Mastery
- HTTP Fundamentals & REST Design: methods, status codes, resource naming, versioning, pagination
- Auth & Security Basics: JWT, bcrypt, CORS, HTTPS headers

### Sau khi hoàn thành module, học viên có thể:

- Đọc và viết Python code có type hint đầy đủ, linter pass (Ruff), không có mypy error
- Định nghĩa Pydantic model với validation phức tạp và serialize/deserialize đúng cách
- Viết async function và xử lý concurrent I/O với `asyncio.gather`
- Thiết kế REST API endpoint đúng chuẩn: method, status code, resource naming, error format
- Sẵn sàng tiếp cận FastAPI ở Phase 3 mà không cần học lại các khái niệm nền tảng này

---

## 2. Phân bổ thời lượng và Nội dung

Module Python bao gồm 3 ngày học liên tiếp (24 giờ). Ngày 1 và 2 tập trung vào Python Fundamentals; Ngày 3 tập trung vào Python Core & Ecosystem.

> **Lưu ý:** Thời lượng mỗi session là tối đa, trainer có thể linh hoạt điều chỉnh theo tiến độ của học viên. Các bài tập thực hành nhỏ (mini exercises) nên được tích hợp xen kẽ sau mỗi topic.

### Ngày 1 — Python Fundamentals: Syntax, Types, Collections & Control Flow

| Session | Nội dung | Chi tiết | Thời lượng (Giờ) |
|---------|----------|----------|:-----------------:|
| 1 | **Giới thiệu & Môi trường** | - Tổng quan Python: lịch sử, đặc điểm, Python 3.12+<br>- Cài đặt Python, pip, uv<br>- Virtual environment: `venv` / `uv venv`<br>- `pyproject.toml` & `requirements.txt`<br>- Chạy chương trình Python đầu tiên<br>- Giới thiệu VS Code + Ruff extension | 1 |
| | **Variables & Data Types** | - Khai báo biến, quy tắc đặt tên (`snake_case`)<br>- Kiểu dữ liệu: `int`, `float`, `str`, `bool`, `None`<br>- Type checking: `type()`, `isinstance()`<br>- Type conversion (implicit & explicit)<br>- f-string, String methods phổ biến<br>- Hằng số (`UPPER_CASE` convention) | 1 |
| | **Collections — List & Tuple** | - List: tạo, truy cập, slicing, thêm/xóa/sửa<br>- List methods: `append`, `extend`, `insert`, `remove`, `pop`, `sort`, `reverse`<br>- List comprehension<br>- Tuple: đặc điểm immutable, unpacking, named tuple<br>- So sánh List vs Tuple — khi nào dùng cái nào | 1 |
| | **Collections — Set & Dictionary** | - Set: tạo, các phép toán (union, intersection, difference)<br>- Set methods, Frozenset<br>- Dict: tạo, truy cập (`get` vs `[]`), thêm/xóa/update<br>- Dict methods: `keys()`, `values()`, `items()`<br>- Dict comprehension<br>- `defaultdict`, `Counter` (collections module) | 1 |
| | **Flow Control** | - `if` / `elif` / `else`, Ternary expression<br>- Logical operators: `and`, `or`, `not`<br>- Vòng lặp `for` (`range`, `enumerate`, `zip`)<br>- Vòng lặp `while`, `break`, `continue`, `pass`<br>- Walrus operator (`:=`) | 1 |

### Ngày 2 — Python Fundamentals: Functions, OOP, Modules & Tooling

| Session | Nội dung | Chi tiết | Thời lượng (Giờ) |
|---------|----------|----------|:-----------------:|
| 2 | **Functions** | - Định nghĩa hàm (`def`), Docstring<br>- Positional, keyword, default arguments<br>- `*args`, `**kwargs`<br>- Return statement, multiple return values<br>- Lambda function<br>- Scope: LEGB rule (Local, Enclosing, Global, Built-in)<br>- Higher-order functions: `map()`, `filter()`, `sorted()` với key<br>- Closure | 2 |
| | **OOP** | - Class, `__init__`, instance vs class attribute<br>- Instance methods, `@classmethod`, `@staticmethod`<br>- `@property` (getter/setter)<br>- Kế thừa (inheritance), `super()`<br>- Đa kế thừa & MRO (Method Resolution Order)<br>- Encapsulation: name mangling (`__attr`)<br>- Polymorphism, Duck typing<br>- Magic/Dunder methods: `__str__`, `__repr__`, `__eq__`, `__len__`<br>- Dataclasses (`@dataclass`) — giới thiệu | 2 |
| | **Decorators** | - Functions as first-class objects<br>- Định nghĩa hàm trong hàm (nested functions)<br>- Returning functions from functions<br>- Viết decorator cơ bản<br>- Decorator với arguments<br>- Chaining decorators<br>- `functools.wraps` — tại sao cần | 1 |
| | **Modules & Packages** | - `import`, `from...import`, `import as`<br>- Tạo module và package (`__init__.py`)<br>- Module search path (`sys.path`)<br>- Standard library: `os`, `sys`, `pathlib`, `json`, `datetime`, `collections`, `itertools`<br>- `__name__ == '__main__'` pattern<br>- Relative vs absolute import | 1 |
| | **File, Errors & Exceptions** | - Đọc/ghi file: `open()`, `with open()` (context manager)<br>- Modes: `r`, `w`, `a`, `rb`, `wb`; `pathlib.Path`<br>- `try` / `except` / `else` / `finally`<br>- `raise`, Exception hierarchy<br>- Custom exception class<br>- Context manager: `__enter__`, `__exit__`, `@contextmanager` | 1 |

### Ngày 3 — Python Core & Ecosystem: Type Hints, Async, Pydantic v2, HTTP & Security

| Session | Nội dung | Chi tiết | Thời lượng (Giờ) |
|---------|----------|----------|:-----------------:|
| 3 | **Type Hints & Typing** | - Tại sao cần type hints trong Python ecosystem hiện đại<br>- Basic annotations: `int`, `str`, `bool`, `float`, `None`<br>- `Optional[T]` vs `T \| None` (Python 3.10+)<br>- `List[T]`, `Dict[K,V]`, `Tuple[T,...]`, `Set[T]`<br>- `Union[A,B]`, `Literal[...]`, `Any`<br>- `TypeVar`, Generic class<br>- `Callable[[ArgTypes], ReturnType]`<br>- Utility types: `TypedDict`, `Protocol`, `Final`<br>- Kiểm tra static với mypy — cài đặt và chạy cơ bản | 2.5 |
| | **Asyncio & Async/Await** | - Synchronous vs Asynchronous — tại sao cần<br>- I/O-bound vs CPU-bound workloads<br>- `async def`, `await` keyword<br>- `asyncio.run()`, Event Loop<br>- `asyncio.gather()` — chạy nhiều coroutine song song<br>- `asyncio.create_task()`<br>- Async context manager (`async with`)<br>- Async iterator (`async for`)<br>- Tích hợp với FastAPI: tại sao handler nên là `async def` | 2.5 |
| | **Pydantic v2 Fundamentals** | - Tại sao Pydantic: validation + serialization + schema generation<br>- `BaseModel`: định nghĩa fields, type validation<br>- `Field()`: default, alias, title, description, examples<br>- `@field_validator` và `@model_validator`<br>- `model_dump()`, `model_json()`, `model_validate()`<br>- Nested models, `List[Model]`<br>- Phân biệt strict mode vs lax mode<br>- Xử lý Optional fields và default values<br>- JSON Schema tự động từ model | 3 |
| | **HTTP Fundamentals & REST Design** | - HTTP request/response lifecycle<br>- Methods: GET, POST, PUT, PATCH, DELETE — semantics & idempotency<br>- Status codes: 200, 201, 204, 400, 401, 403, 404, 409, 422, 500<br>- Headers: Content-Type, Authorization, CORS headers<br>- REST conventions: resource naming (`/users`, `/users/{id}`)<br>- API Versioning (`/api/v1/`), Pagination (page/limit, cursor)<br>- Chuẩn Error response: `{code, message, details}` | 2 |
| | **Auth & Security Basics** | - JWT: header.payload.signature, signing (HS256 vs RS256)<br>- Access token vs Refresh token — khi nào cần rotation<br>- bcrypt: hashing password, salt rounds, verify<br>- CORS: origin policy, preflight request, credentials<br>- HTTPS headers: HSTS, X-Content-Type-Options, X-Frame-Options<br>- Rate limiting concept<br>- Tại sao không lưu plaintext password, không log token | 2 |

**Tổng cộng: 24 giờ**
