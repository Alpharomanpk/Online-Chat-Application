# Online Chat App

This repository contains the source code and documentation for an Online Chat App, a web application that allows users to communicate with each other in real-time. The app is built using modern web technologies and follows a client-server architecture.

## Features

- **Real-time Messaging**: Users can send and receive messages instantly, enabling real-time communication.
- **User Authentication**: The app supports user authentication, ensuring that only registered users can access the chat system.
- **User Profiles**: Each user has a profile where they can update their information and display a profile picture.
- **Private and Group Chats**: Users can engage in one-on-one private chats or join group chats based on their interests.
- **Message Notifications**: Users receive notifications for new messages, ensuring they never miss an important conversation.
- **Message History**: The app keeps a record of chat messages, allowing users to view previous conversations.
- **Emojis and File Sharing**: Users can express themselves with emojis and share files within the chat interface.

## Technologies Used

The Online Chat App is built using the following technologies:

- **Frontend**: HTML, CSS, JavaScript
- **Backend**: Firebase
- **Database**: NO-SQL
- **Real-time Communication**: Socket.IO
- **User Authentication**: JSON Web Tokens (JWT)
- **Image/File Upload**: Multer


## Getting Started

To run the Online Chat App locally, follow these steps:

1. Clone the repository: `git clone https://github.com/your-username/online-chat-app.git`
2. Navigate to the project directory: `cd online-chat-app`
3. Install the dependencies: `npm install`
4. Create a MongoDB database and update the connection string in the `.env` file.
5. Start the development server: `npm start`
6. Access the app in your browser at `http://localhost:3000`

## Folder Structure

The repository follows a specific folder structure:

- `app.js`: Entry point of the application.
- `routes/`: Contains route handlers for different API endpoints.
- `models/`: Defines the database models and schemas.
- `controllers/`: Implements the logic for different routes.
- `views/`: Contains the HTML templates for rendering views.
- `public/`: Includes static files such as CSS stylesheets and client-side JavaScript.
- `config/`: Contains configuration files for the app.
- `middleware/`: Defines middleware functions used in the app.
- `uploads/`: Stores uploaded files.
- `utils/`: Includes utility functions used throughout the app.

## Contributing

Contributions to the Online Chat App are welcome! If you have any ideas or suggestions, please follow these steps:

1. Fork the repository.
2. Create a new branch: `git checkout -b feature/your-feature`.
3. Make your changes and commit them: `git commit -m 'Add some feature'`.
4. Push to the branch: `git push origin feature/your-feature`.
5. Open a pull request.

Please ensure that your code follows the existing coding style and includes appropriate tests.

## License

Non

## Acknowledgments

- This project was inspired by the need for a modern and efficient online chat application.
- Thanks to the open-source community for providing the tools and libraries used in this project.

