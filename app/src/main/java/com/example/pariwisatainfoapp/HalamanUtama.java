package com.example.pariwisatainfoapp;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class HalamanUtama extends AppCompatActivity {
    private RecyclerView recyclerView;
    private Adapter adapter;
    private ArrayList<ItemList> listItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.halaman_utama);

        recyclerView = findViewById(R.id.recyclerView);
        SearchView searchView = findViewById(R.id.searchview);
        listItem = new ArrayList<>();

        // Tambahkan data ke listItem
        listItem.add(new ItemList(
                R.drawable.bromo,
                "Bromo",
                "Keindahan Gunung dan Laut Pasir",
                "Gunung Bromo adalah salah satu destinasi wisata terpopuler di Indonesia yang menawarkan keindahan alam yang memukau. Kawasan ini dikenal dengan Lautan Pasir Tengger yang luas, dipadu dengan pemandangan matahari terbit yang mempesona. Suasana di sekitar gunung sangat tenang dan dingin, menjadikannya tempat favorit untuk bersantai dan mengagumi keajaiban alam.\n\n" +
                        "Selain panorama alam, Gunung Bromo juga terkenal dengan upacara adat Kasada yang dilakukan oleh masyarakat suku Tengger. Wisatawan dapat menyaksikan tradisi unik ini yang melibatkan persembahan kepada Sang Hyang Widhi di kawah gunung. Aktivitas trekking menuju puncak Bromo pun memberikan pengalaman petualangan yang tak terlupakan."
        ));

        listItem.add(new ItemList(
                R.drawable.kawah_ijen,
                "Kawah Ijen",
                "Api Biru yang Menakjubkan",
                "Kawah Ijen, yang terletak di perbatasan Banyuwangi dan Bondowoso, adalah salah satu destinasi wisata terkenal di Indonesia. Kawah ini terkenal dengan fenomena alam unik berupa api biru yang hanya dapat dilihat pada malam hari. Danau kawahnya yang penuh dengan air asam sulfat menambah daya tarik kawasan ini dengan warna hijau toska yang menawan.\n\n" +
                        "Selain keindahan alamnya, Kawah Ijen juga merupakan tempat para penambang belerang mencari penghidupan. Wisatawan dapat melihat langsung proses penambangan tradisional yang penuh tantangan ini, memberikan wawasan tentang kehidupan lokal yang jarang ditemukan di tempat lain."
        ));

        listItem.add(new ItemList(
                R.drawable.nusa_penida,
                "Nusa Penida",
                "Surga Tersembunyi di Bali",
                "Nusa Penida adalah sebuah pulau kecil di sebelah tenggara Bali yang menawarkan keindahan alam yang spektakuler. Pulau ini menjadi tujuan favorit bagi pecinta alam dan fotografi, berkat pemandangan tebing-tebing tinggi yang menghadap ke laut biru. Pantai Kelingking, dengan bentuknya yang menyerupai dinosaurus, adalah salah satu lokasi yang paling ikonik di sini.\n\n" +
                        "Selain pantai-pantai yang memukau, Nusa Penida juga memiliki tempat snorkeling dan diving kelas dunia. Spot seperti Crystal Bay dan Manta Point memungkinkan wisatawan untuk berenang bersama ikan pari manta yang besar, serta menikmati kehidupan bawah laut yang luar biasa kaya."
        ));

        listItem.add(new ItemList(
                R.drawable.padar_bajo,
                "Padar Island, Labuan Bajo",
                "Gerbang ke Dunia Komodo dan Surga Bahari",
                "Pulau Padar, yang terletak di Taman Nasional Komodo, adalah destinasi yang sangat populer di Indonesia bagian timur. Pemandangan dari puncaknya yang terkenal memperlihatkan garis pantai berliku dengan pasir pantai berwarna putih, merah, dan hitam. Ini adalah lokasi yang sempurna untuk mendaki dan menikmati panorama luar biasa.\n\n" +
                        "Labuan Bajo, sebagai pintu gerbang ke Taman Nasional Komodo, juga menawarkan wisata kapal untuk menjelajahi pulau-pulau sekitarnya. Wisatawan dapat melihat komodo secara langsung di habitat aslinya, menjadikan perjalanan ini pengalaman yang sangat istimewa."
        ));

        listItem.add(new ItemList(
                R.drawable.prambanan,
                "Candi Prambanan",
                "Keindahan Candi Hindu Terbesar",
                "Candi Prambanan adalah kompleks candi Hindu terbesar di Indonesia dan merupakan Situs Warisan Dunia UNESCO. Dibangun pada abad ke-9, candi ini didedikasikan untuk Trimurti: Brahma, Wisnu, dan Siwa. Arsitekturnya yang rumit dan megah menjadi bukti kejayaan kerajaan Mataram kuno.\n\n" +
                        "Selain keindahan bangunan, Prambanan juga sering menjadi tempat penyelenggaraan sendratari Ramayana. Pertunjukan ini menggabungkan seni tari, musik, dan cerita epik yang berlatar di sekitar candi, menciptakan pengalaman budaya yang sangat menarik bagi wisatawan."
        ));

        listItem.add(new ItemList(
                R.drawable.raja_ampat,
                "Raja Ampat",
                "Surga Terumbu Karang Dunia",
                "Raja Ampat, yang terletak di Papua Barat, adalah salah satu destinasi wisata laut terbaik di dunia. Kepulauan ini terkenal dengan keanekaragaman hayati lautnya yang luar biasa, termasuk lebih dari 75% spesies karang dunia. Ini adalah surga bagi penyelam dan pecinta snorkeling.\n\n" +
                        "Di daratan, wisatawan dapat menikmati pemandangan hutan tropis, desa-desa tradisional, dan pantai-pantai yang masih alami. Pulau-pulau seperti Wayag dan Pianemo menawarkan pemandangan ikonik berupa gugusan pulau karang yang menjulang dari laut biru."
        ));

        listItem.add(new ItemList(
                R.drawable.tana_toraja,
                "Tana Toraja",
                "Budaya dan Tradisi Kematian Unik",
                "Tana Toraja, yang terletak di Sulawesi Selatan, adalah tempat dengan budaya dan tradisi yang sangat unik. Tradisi pemakaman Rambu Solo' menjadi daya tarik utama, di mana prosesi ini dianggap sebagai perayaan kehidupan dan kematian. Wisatawan dapat menyaksikan acara adat ini yang biasanya berlangsung selama beberapa hari.\n\n" +
                        "Selain tradisi pemakaman, Tana Toraja juga memiliki keindahan alam yang luar biasa. Pegunungan, sawah berundak, dan desa-desa tradisional dengan rumah tongkonan menciptakan suasana yang tenang dan indah, cocok untuk perjalanan yang penuh eksplorasi budaya."
        ));

        listItem.add(new ItemList(
                R.drawable.tanjung_puting,
                "Tanjung Puting",
                "Rumah Orangutan",
                "Taman Nasional Tanjung Puting, yang terletak di Kalimantan Tengah, adalah tempat perlindungan bagi orangutan. Wisatawan dapat menikmati perjalanan menyusuri sungai menggunakan klotok (kapal kayu tradisional) untuk melihat orangutan di habitat aslinya.\n\n" +
                        "Selain orangutan, taman nasional ini juga memiliki berbagai spesies satwa liar lainnya, seperti bekantan, buaya, dan burung eksotis. Pengalaman berlayar melalui hutan tropis yang lebat menjadikan kunjungan ke Tanjung Puting sangat mengesankan."
        ));

        listItem.add(new ItemList(
                R.drawable.toba,
                "Danau Toba",
                "Danau Vulkanik Terbesar",
                "Danau Toba, yang terletak di Sumatra Utara, adalah danau vulkanik terbesar di dunia dan salah satu keajaiban alam Indonesia. Di tengah danau terdapat Pulau Samosir, yang menjadi pusat budaya Batak. Wisatawan dapat menjelajahi sejarah dan tradisi suku Batak melalui tarian, musik, dan seni ukir mereka.\n\n" +
                        "Danau ini juga menawarkan pemandangan yang menakjubkan dengan airnya yang biru dan dikelilingi oleh pegunungan hijau. Aktivitas seperti berenang, berperahu, atau sekadar bersantai menikmati pemandangan, menjadikan Danau Toba tempat yang sempurna untuk relaksasi."
        ));

        listItem.add(new ItemList(
                R.drawable.bunaken,
                "Bunaken",
                "Taman Laut dengan Keindahan Tak Tertandingi",
                "Bunaken terletak di Sulawesi Utara dan merupakan bagian dari Taman Nasional Bunaken. Kawasan ini terkenal dengan keindahan taman lautnya yang memukau dan merupakan surga bagi para penyelam. Terumbu karang yang penuh warna, ikan-ikan tropis, dan biodiversitas laut yang tinggi menjadikan Bunaken sebagai salah satu destinasi menyelam terbaik di dunia.\n\n" +
                        "Selain aktivitas menyelam dan snorkeling, wisatawan juga dapat menjelajahi pantai-pantai berpasir putih yang mengelilingi pulau ini. Kehidupan laut yang spektakuler dapat dinikmati di lebih dari 20 titik selam yang tersebar di sekitar taman nasional.\n\n" +
                        "Bunaken juga menjadi lokasi penting untuk penelitian laut dan pelestarian terumbu karang. Penduduk lokal sangat ramah, dan wisatawan dapat merasakan budaya masyarakat Sulawesi yang autentik sambil menikmati pemandangan indah di sekitarnya."
        ));

        listItem.add(new ItemList(
                R.drawable.candi_borobudur,
                "Candi Borobudur",
                "Monumen Budaya Agung di Jawa Tengah",
                "Candi Borobudur terletak di Magelang, Jawa Tengah, dan merupakan candi Buddha terbesar di dunia. Dibangun pada abad ke-8, candi ini terkenal dengan arsitektur megahnya yang terdiri dari sembilan tingkat berteras dan ratusan relief yang menghiasi dindingnya. Setiap relief menggambarkan ajaran Buddha dan kehidupan masyarakat pada masa itu.\n\n" +
                        "Selain keindahan arsitekturnya, wisatawan dapat menikmati pemandangan matahari terbit yang memukau dari puncak candi. Dikelilingi oleh pegunungan, suasana di sekitar Borobudur sangat menenangkan, membuatnya menjadi tempat yang sempurna untuk meditasi dan refleksi.\n\n" +
                        "Borobudur juga menjadi pusat berbagai festival budaya, seperti Waisak, yang menarik ribuan peziarah dan wisatawan dari seluruh dunia. Tradisi ini menambah nilai spiritual bagi pengunjung yang ingin merasakan kedamaian dan harmoni."
        ));

        listItem.add(new ItemList(
                R.drawable.dieng,
                "Dataran Tinggi Dieng",
                "Negeri di Atas Awan Jawa Tengah",
                "Dataran Tinggi Dieng terletak di Kabupaten Wonosobo dan Banjarnegara, Jawa Tengah. Dieng terkenal sebagai kawasan vulkanik dengan pemandangan pegunungan yang indah dan cuaca yang sejuk. Wisatawan dapat mengunjungi kawah-kawah aktif, seperti Kawah Sikidang, dan menikmati fenomena alam unik lainnya seperti Telaga Warna.\n\n" +
                        "Selain kekayaan alamnya, Dieng juga memiliki sejarah budaya yang kuat. Di sini terdapat kompleks candi Hindu tertua di Indonesia, yang mencerminkan kejayaan peradaban kuno. Candi-candi ini menjadi tempat yang cocok untuk mengenal sejarah dan tradisi Jawa kuno.\n\n" +
                        "Dieng juga menjadi lokasi festival tahunan yang disebut Dieng Culture Festival. Acara ini menampilkan berbagai kegiatan budaya, seperti ritual pemotongan rambut gimbal, konser musik, dan pertunjukan seni tradisional, memberikan pengalaman yang tak terlupakan bagi pengunjung."
        ));

// Tambahkan item lainnya sesuai format di atas:
        listItem.add(new ItemList(
                R.drawable.derawan,
                "Kepulauan Derawan",
                "Surga Laut di Kalimantan Timur",
                "Kepulauan Derawan terletak di Kalimantan Timur dan dikenal sebagai salah satu destinasi wisata bahari terbaik di Indonesia. Dengan air laut yang jernih dan keanekaragaman hayati yang tinggi, Derawan menawarkan pengalaman snorkeling dan diving yang luar biasa. Salah satu daya tarik utamanya adalah ubur-ubur tanpa sengat yang hanya ditemukan di beberapa tempat di dunia.\n\n" +
                        "Selain bawah lautnya, pulau-pulau seperti Kakaban dan Maratua juga menawarkan pemandangan pantai yang indah dengan pasir putih yang halus. Derawan juga menjadi rumah bagi penyu hijau, yang sering terlihat bertelur di pantai-pantai pulau ini.\n\n" +
                        "Wisatawan dapat menikmati suasana pulau yang tenang sambil mempelajari kehidupan masyarakat lokal yang masih kental dengan tradisi. Kuliner khas seafood juga menjadi daya tarik tambahan untuk menjelajahi Derawan."
        ));

        listItem.add(new ItemList(
                R.drawable.goacina,
                "Goa Cina",
                "Eksotisme Pantai dan Sejarah di Malang",
                "Goa Cina terletak di pesisir selatan Kabupaten Malang, Jawa Timur. Pantai ini menawarkan keindahan alam yang eksotis dengan pasir putih, ombak besar, dan tiga pulau kecil yang menghiasi panorama lautnya. Goa ini dinamakan 'Goa Cina' karena ditemukan peninggalan budaya Tionghoa di dalamnya.\n\n" +
                        "Selain pemandangan alamnya, pengunjung juga bisa memasuki gua yang menyimpan sejarah unik. Dalam gua ini terdapat berbagai cerita legenda dan tradisi lokal yang menarik untuk disimak. Suasana yang tenang menjadikan Goa Cina sebagai tempat yang cocok untuk relaksasi.\n\n" +
                        "Pantai Goa Cina juga menjadi destinasi favorit para fotografer yang ingin menangkap keindahan matahari terbit atau terbenam. Wisatawan dapat menjelajahi kawasan ini sambil menikmati kuliner khas Malang yang tersedia di sekitar pantai."
        ));

        listItem.add(new ItemList(
                R.drawable.rinjani,
                "Gunung Rinjani",
                "Pesona Gunung Berapi di Lombok",
                "Gunung Rinjani terletak di Pulau Lombok, Nusa Tenggara Barat, dan merupakan gunung berapi tertinggi kedua di Indonesia. Gunung ini menjadi tujuan favorit para pendaki karena pemandangan spektakuler yang ditawarkan sepanjang perjalanan menuju puncaknya. Danau Segara Anak di kawah gunung menjadi salah satu daya tarik utama dengan airnya yang biru jernih.\n\n" +
                        "Selain trekking, wisatawan juga dapat menikmati suasana hutan tropis di sekitar gunung yang kaya akan flora dan fauna. Beberapa sumber air panas di kawasan ini juga sering dikunjungi untuk relaksasi setelah mendaki.\n\n" +
                        "Rinjani tidak hanya terkenal karena keindahan alamnya, tetapi juga nilai spiritualnya bagi masyarakat lokal. Setiap tahun, upacara adat dilakukan oleh suku Sasak dan Bali untuk menghormati gunung yang mereka anggap sakral."
        ));

        listItem.add(new ItemList(
                R.drawable.sentani,
                "Danau Sentani",
                "Permata di Tanah Papua",
                "Danau Sentani terletak di Kabupaten Jayapura, Papua, dan merupakan danau terbesar di Papua. Dikelilingi oleh perbukitan hijau dan dihiasi oleh pulau-pulau kecil, danau ini menawarkan pemandangan alam yang memukau. Wisatawan dapat menikmati aktivitas seperti berperahu mengelilingi danau atau sekadar bersantai di tepiannya.\n\n" +
                        "Danau Sentani juga dikenal dengan Festival Danau Sentani yang diadakan setiap tahun. Acara ini menampilkan berbagai pertunjukan seni dan budaya dari masyarakat adat Papua, termasuk tarian tradisional dan lomba perahu khas Papua.\n\n" +
                        "Selain itu, danau ini menjadi tempat penting untuk mempelajari sejarah Papua karena ditemukan berbagai artefak kuno yang menunjukkan kehidupan masyarakat lokal di masa lalu. Wisatawan dapat merasakan pengalaman budaya yang mendalam di sini."
        ));

        listItem.add(new ItemList(
                R.drawable.togean,
                "Kepulauan Togean",
                "Surga Tersembunyi di Sulawesi Tengah",
                "Kepulauan Togean terletak di Teluk Tomini, Sulawesi Tengah, dan merupakan bagian dari Taman Nasional Kepulauan Togean. Pulau-pulau ini terkenal dengan keindahan bawah lautnya yang masih sangat alami, termasuk terumbu karang yang luas dan berbagai spesies ikan tropis. Spot diving seperti Atol Una-Una sangat populer di kalangan penyelam.\n\n" +
                        "Selain itu, pantai-pantai berpasir putih yang tenang membuat Togean cocok untuk wisatawan yang mencari ketenangan. Wisatawan juga dapat mengunjungi desa-desa tradisional untuk merasakan kehidupan masyarakat lokal yang ramah.\n\n" +
                        "Keberagaman ekosistem laut dan darat di Togean menjadikannya lokasi penting untuk penelitian dan konservasi. Kawasan ini tetap terjaga keasriannya, menjadikannya destinasi impian bagi pecinta alam dan ekowisata."
        ));

        listItem.add(new ItemList(
                R.drawable.ujung_kulon,
                "Taman Nasional Ujung Kulon",
                "Habitat Badak Jawa yang Langka",
                "Taman Nasional Ujung Kulon terletak di ujung barat Pulau Jawa, Banten. Kawasan ini merupakan Situs Warisan Dunia UNESCO yang terkenal sebagai habitat alami badak Jawa yang hampir punah. Selain itu, taman ini menawarkan hutan tropis lebat, pantai yang indah, dan beragam satwa liar lainnya.\n\n" +
                        "Wisatawan dapat menikmati aktivitas seperti trekking, menyusuri sungai, atau menjelajahi Pulau Peucang yang menjadi daya tarik utama. Pulau ini memiliki pantai berpasir putih dan air laut yang jernih, cocok untuk snorkeling dan bersantai.\n\n" +
                        "Ujung Kulon juga menjadi lokasi yang penting untuk penelitian dan konservasi satwa langka. Keindahan alam dan nilai ekologisnya membuat taman nasional ini menjadi tujuan favorit bagi pencinta alam dan fotografer."
        ));

        listItem.add(new ItemList(
                R.drawable.wakatobi,
                "Wakatobi",
                "Surga Penyelaman di Sulawesi Tenggara",
                "Wakatobi terletak di Sulawesi Tenggara dan merupakan salah satu destinasi wisata bahari terbaik di Indonesia. Taman Nasional Wakatobi terkenal dengan keanekaragaman terumbu karangnya yang luar biasa, menjadikannya salah satu tempat menyelam terbaik di dunia. Wisatawan dapat menemukan lebih dari 750 spesies koral di sini.\n\n" +
                        "Selain menyelam, Wakatobi juga menawarkan pengalaman budaya melalui kunjungan ke desa-desa tradisional. Penduduk lokal, yang sebagian besar adalah suku Bajo, dikenal sebagai 'pengembara laut' dengan tradisi unik yang dapat ditemukan di kawasan ini.\n\n" +
                        "Pemandangan alam di atas permukaan air juga tidak kalah indahnya, dengan pantai-pantai yang tenang dan perairan biru yang jernih. Wakatobi menjadi destinasi yang sempurna untuk menikmati alam dan budaya dalam harmoni."
        ));

        listItem.add(new ItemList(
                R.drawable.weh,
                "Pulau Weh",
                "Pesona Pulau Terujung di Indonesia",
                "Pulau Weh terletak di ujung barat Indonesia, tepatnya di Aceh. Pulau kecil ini menawarkan keindahan alam yang luar biasa, terutama bagi pecinta snorkeling dan diving. Pantai Iboih dan Gapang adalah dua lokasi populer yang memiliki air jernih dan kehidupan bawah laut yang kaya.\n\n" +
                        "Selain wisata bahari, Pulau Weh juga memiliki nilai sejarah yang tinggi. Tugu Nol Kilometer Indonesia menjadi tempat wajib dikunjungi untuk merasakan suasana patriotisme sambil menikmati pemandangan laut yang memukau.\n\n" +
                        "Pulau ini juga menawarkan kuliner khas Aceh yang menggugah selera, seperti mi Aceh dan kopi lokal. Kombinasi antara keindahan alam, sejarah, dan budaya membuat Pulau Weh menjadi destinasi yang lengkap untuk dikunjungi."
        ));


        // Hubungkan adapter ke RecyclerView
        adapter = new Adapter(listItem, this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                adapter.getFilter().filter(query); // Mulai pencarian saat tombol submit ditekan
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText); // Filter secara real-time saat teks berubah
                return false;
            }
        });


    }
}
