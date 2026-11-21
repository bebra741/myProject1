import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.appcompat.app.AppCompatActivity
import kotlin.math.abs
import kotlin.random.Random
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(PongView(this))
    }
}
class PongView(context: Context) : View(context) {
    private val paint = Paint(Paint.ANTI_ALIAS_FLAG)
    private val linePaint = Paint(Paint.ANTI_ALIAS_FLAG).apply {
        color = color.DKGRAY
        strokeWidth = 6f
        style = Paint.Style.STROKE
        pathEffect = DashPathEffect(floatArray(25f,25f), 0f) }
    private val ballX = 0f
    private val ballY = 0f
    private val ballVx = 0f
    private val ballVy = 0f
    private val ballRadius = 22f
    private val paddleWidth = 240f
    private val paddleHeight = 32f
    private val playerX = 0f
    private val aiX = 0f
    private val aiSpeed = 11f
    private val playerScore = 0
    private val aiScore = 0
    private val isInitialized = false
    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w,h,oldw,oldh)
        if (!isInitialized && w > 0 && h > 0) {
            playerX = (w - paddleWidth) / 2f
            aiX = (w - paddleWidth) / 2f
            resetBall(w, h)
            isInitialized = true}}
    private fun resetBall(w: Int, h: Int) {
        ballX = w / 2f
        ballY = h / 2f
        val dirX = if (Random.nextBoolean()) 1f else -1f
        val dirY = if (Random.nextBoolean()) 1f else -1f
        ballVx = 10f * dirX
        ballVy = 13f * dirY }
    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        if (!isInitialized) return
        canvas.drawColor(Color.parseColor("#87CEFA"))
        canvas.drawLine(0f, height / 2f, width.toFloat(), height / 2f,linePaint)
        updateGame()
        paint.color = Color.WHITE
        paint.textSize =90f
        paint.textAlgin = Paint.Algin.LEFT
        canvas.drawText(aiScore.toString(), 60f, height / 2f - 50f, paint)
        canvas.drawText(playerScore.toString(), 60f, height / 2f + 115f, paint)
        val aiTop = 90f
        val playerTop = height - 80f - paddleHeight
        paint.color = color.parseColor("#FF5252")
        canvas.drawRoundRect(aiX, aiTop, aiX + paddleWidth, aiTop + paddleHeight, 16f, 16f, paint)
        paint.color = Color.parseColor("#448AFF")
    
            
  



